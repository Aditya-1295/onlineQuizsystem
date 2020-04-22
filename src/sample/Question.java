package sample;

public class Question {
    int qno; //question number
    private String question;
    private String opt1,opt2,opt3,opt4;

    public String getQuestion()
    {
        return question;
    }
    public String getOpt1()
    {
        return opt1;
    }
    public String getOpt2()
    {
        return opt2;
    }
    public String getOpt3()
    {
        return opt3;
    }
    public String getOpt4()
    {
        return opt4;
    }
    public Question()
    {

    }
    public Question(int qno,String question,String opt1,String opt2,String opt3,String opt4)
    {
        this.qno = qno;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
    }
    public int get_qno()
    {
        return qno;
    }
    public void display()
    {
        System.out.println(qno+". "+question+"\nA:"+opt1+"\nB:"+opt2+"\nC:"+opt3+"\nD:opt4");
    }
    public void update_question(String question,String opt1,String opt2,String opt3,String opt4)
    {
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
    }



}
