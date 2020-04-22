class Student  extends User{
    private String enroll,batch;

    public Student(String name,String password,String enroll,String batch)
    {
        super(name,password);
        this.enroll = enroll;
        this.batch = batch;
    }


}
