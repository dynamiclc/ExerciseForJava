public class EvaluateReversePolishNotation {
  public int evalRPN(String[] tokens) {
    int result = 0;
    
    // Go along the input string,
    // push operand into stack
    String operatorsCharacters = "+-*/";
    Stack<String> stack = new Stack<String>();
    int tokenCount = tokens.length;
    for (int i = 0; i < tokenCount; i++) {
      String token = tokens[i];
      // current token is an operator
      if (operatorsCharacters.contains(token)) {
        int operandRight = Integer.valueOf(stack.pop());
        int operandLeft = Integer.valueOf(stack.pop());
        int operationResult = 0;
        // do operation
        if (token.equals("+")) {
          operationResult = operandLeft + operandRight;
        } else if (token.equals("-")) {
          operationResult = operandLeft - operandRight;
        } else if (token.equals("*")) {
          operationResult = operandLeft * operandRight;
        } else if (token.equals("/")) {
          operationResult = operandLeft / operandRight;
        } else {
        }
        stack.push(String.valueOf(operationResult));
      } else { // current token is an operand
        stack.push(token);
      }
    } 
    
    result = Integer.valueOf(stack.pop());
    return result;
  }
}
