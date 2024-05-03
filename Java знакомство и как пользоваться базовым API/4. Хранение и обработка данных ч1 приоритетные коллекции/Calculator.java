
class Calculator {

    public int calculate(char op, int a, int b) {
        int result = 0;
        int previous = 0;
        int next = 0;
        
        switch (op) {
            case '+':
                result = a + b;
                previous = result;
                break;
            case '-':
                result = a - b;
                previous = result;
                break;
            case '*':
                result = a * b;
                previous = result;
                break;
            case '/':
                result = a / b;
                previous = op;
                break;
            case '<':
                result = previous;
                //break;
            default:
                return result;    
        }
        return previousOp;
    } 
}         
