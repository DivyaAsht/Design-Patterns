public class Interpreter {
    private Context context;
    public Interpreter(Context context){
        this.context=context;
    }
    public int interpret(String expression){
        Expression expTree = buildExpressionTree(expression);
        return expTree.interpret(context);
    }
    public Expression buildExpressionTree(String Expresion){
        return new AdditionExpression(new NumberExpression(2), new MultiplicationExpression(new NumberExpression(3),new NumberExpression(4)));
    }
}
