package homework6;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stk = new Stack(20);
        int pop;
        for (int i = 0; i < text.length(); i++) {
            char braceIndex = text.charAt(i);
            switch (braceIndex) {
                case '(':
                case '{':
                case '[':
                    stk.push(braceIndex);
                    break;
                case ']':
                    pop = stk.pop();
                    if (pop == 0) {
                        System.out.println("Error: closed" + braceIndex + " but not opened");
                    } else if (pop != '[') {
                        System.out.println("Error: opened " + (char) pop + " but closed " + braceIndex + " at " + i);
                    }
                    break;
                case '}':
                    pop = stk.pop();
                    if (pop == 0) {
                        System.out.println("Error: closed" + braceIndex + " but not opened");
                    } else if (pop != '{') {
                        System.out.println("Error: opened " + (char) pop + " but closed " + braceIndex + " at " + i);
                    }
                    break;
                case ')':
                    pop = stk.pop();
                    if (pop == 0) {
                        System.out.println("Error: closed" + braceIndex + " but not opened");
                    } else if (pop != '(') {
                        System.out.println("Error: opened " + (char) pop + " but closed " + braceIndex + " at " + i);
                    }
                    break;
            }
        }

        while (stk.getIndex() != -1) {
            System.out.println("Error.Opened " + (char) stk.pop() + " but not closed");
        }
    }
}

