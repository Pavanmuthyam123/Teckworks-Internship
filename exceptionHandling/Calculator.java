import java.util.*;
class InvalidExpressionException extends Exception
  {
     public InvalidExpressionException(String mess)
    {
      super(mess);
    }
  }
public class Calculator
  {
      public static double evaluate(String expression) throws InvalidExpressionException
    {
      String[] tokens = expression.split(" ");
       if (tokens.length != 3) 
       {
          throw new InvalidExpressionException("Expression must be in the form 'operand operator operand'");
       }
      double op1, op2;
       try
         {
            op1 = Double.parseDouble(tokens[0]);
            op2 = Double.parseDouble(tokens[2]);
         }
      catch (NumberFormatException e)
         {
           throw new InvalidExpressionException("Operands must be numbers");
         }
      double result;
      switch (tokens[1])
         {
            case "+":
            result = op1 + op2;
            break;
            case "-":
            result = op1 - op2;
            break;
            case "*":
            result = op1 * op2;
            break;
            case "/":
        if (op2 == 0)
           {
            throw new InvalidExpressionException("Division by zero is not allowed");
           }
          result = op1 / op2;
          break;
          default:
          throw new InvalidExpressionException("Invalid operator");
        }
       return result;
    }
  }