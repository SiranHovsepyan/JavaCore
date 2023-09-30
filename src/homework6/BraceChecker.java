package homework6;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stk = new Stack(20);
        for (int i = 0; i < text.length(); i++) {
            char braceIndex = text.charAt(i);
            switch (braceIndex) {
                case '(':
                case '{':
                case '[':
                    stk.push(braceIndex);
                    break;
                case ']':
                    if (stk.tos == -1) {
                        System.out.println("Error: closed ] but not opened");
                        break;
                    }
                    if (stk.lastIndex() == '[') {
                        stk.pop();
                        break;
                    }
                    if (stk.lastIndex() == '{') {
                        System.out.println("Error: opened { but closed ] at " + i);
                        break;
                    }
                    if (stk.lastIndex() == '(') {
                        System.out.println("Error: opened ( but closed ] at " + i);
                        break;
                    }
                case '}':
                    if (stk.tos == -1) {
                        System.out.println("Error: closed } but not opened");
                        break;
                    }
                    if (stk.lastIndex() == '{') {
                        stk.pop();
                        break;
                    }
                    if (stk.lastIndex() == '(') {
                        System.out.println("Error: opened ( but closed } at " + i);
                        break;
                    }
                    if (stk.lastIndex() == '[') {
                        System.out.println("Error: opened [ but closed } at " + i);
                        break;
                    }
                case ')':
                    if (stk.tos == -1) {
                        System.out.println("Error: closed ) but not opened");
                        break;
                    }
                    if (stk.lastIndex() == '(') {
                        stk.pop();
                        break;
                    }
                    if (stk.lastIndex() == '{') {
                        System.out.println("Error: opened { but closed ) at " + i);
                        break;
                    }
                    if (stk.lastIndex() == '[') {
                        System.out.println("Error: opened [but closed ) at " + i);
                        break;
                    }
            }
        }
    }
}

