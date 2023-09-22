public class Teacher {
    String name;
    String mpnum;
    String branch;

    Teacher(String name, String branch, String mpnum) {
        this.name = name;
        this.branch = branch;
        this.mpnum = mpnum;
    }

    void print(){
        System.out.println("Adı :"+this.name);
        System.out.println("Alanı :"+this.branch);
        System.out.println("Telefonu :"+this.mpnum);
    }
}
