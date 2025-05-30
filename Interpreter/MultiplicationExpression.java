public class MultiplicationExpression implements Expression {
    private Expression left;
    private Expression right;
    public MultiplicationExpression(Expression left,Expression right){
        this.left=left;
        this.right=right;
    }
    public int interpret(Context context){
        return left.interpret(context)*right.interpret(context);
    }
}
