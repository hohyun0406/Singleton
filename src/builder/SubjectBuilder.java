package builder;

public class SubjectBuilder {
    private int korean;
    private int english;
    private int math;

    public SubjectBuilder (){
        this.korean = korean;
        return this;
    }

    public SubjectBuilder () {
        this.english = english;
        return this;
    }

    public SubjectBuilder () {
        this.math = math;
        return this;
    }

}
