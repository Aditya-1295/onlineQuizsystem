import sample.Question;

class Quiz extends Question {

    private Question []quiz;
    int top;
    public Quiz(int num) //Number of Question in the quiz
    {
        quiz = new Question[num];
        top = 0;
    }
    public void addQuestion(String question,String opt1,String opt2,String opt3,String opt4)
    {
        Question q = new Question((top+1),question,opt1,opt2,opt3,opt4);
        quiz[top] = q;
        top +=1;
    }
    public void update_Question(int qno)
    {
        if(qno>(top+1))
        {
            System.out.println("Invalid Question number");
        }
        else
        {
            for (int i = 0; i < top; i += 1) {
                if (qno == quiz[i].get_qno())
                {
                    quiz[i].display();//Display original question
                    //GET INPUTS FROM USER FOR QUESTIONS AND OPTIONS
                    //quiz[i].update_question(String question,String opt1,String opt2,String opt3,String opt4);
                    quiz[i].display();//Display updated question

                    break;

                }
            }
        }

    }

}
