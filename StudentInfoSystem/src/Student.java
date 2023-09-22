public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNum;
    String classes;
    double average;
    boolean isPass;

    Student (String name, String stuNum, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNum = stuNum;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote (int note1, int note2, int note3) {
        if (note1 >=0 && note1 <=100) {
            this.c1.note = note1;
        }
        if (note2 >=0 && note2 <=100) {
            this.c2.note = note2;
        }
        if (note3 >=0 && note3 <=100) {
            this.c3.note = note3;
        }
    }

    void addBulkVerbalNote (int verbalNote1, int verbalNote2, int verbalNote3) {
        if (verbalNote1 >=0 && verbalNote1 <=100){
            this.c1.verbalNote = verbalNote1;
        }
        if (verbalNote2 >=0 && verbalNote2 <=100){
            this.c2.verbalNote = verbalNote2;
        }
        if (verbalNote3 >=0 && verbalNote3 <=100){
            this.c3.verbalNote = verbalNote3;
        }
    }

    void finalNote (double finalNote1, double finalNote2, double finalNote3) {
        this.c1.finalNote = ((c1.note*0.70) + (c1.verbalNote * 0.30));
        this.c2.finalNote = ((c2.note*0.75) + (c2.verbalNote * 0.25));
        this.c3.finalNote = ((c3.note*0.65) + (c3.verbalNote * 0.35));
    }

    void isPass(){
        this.average = (this.c1.finalNote+this.c2.finalNote+this.c3.finalNote)/3.0;
        printFinalNote();
        if (this.average>55){
            System.out.println("Sınıfı geçtiniz!");
            isPass = true;
        }else {
            System.out.println("Sınıfta kaldınız!");
            isPass = false;
        }
    }

    void printFinalNote (){
        System.out.println("================================");
        System.out.println(this.c1.name+" Ortalama notu :"+c1.finalNote);
        System.out.println(this.c2.name+" Ortalama notu :"+c2.finalNote);
        System.out.println(this.c3.name+" Ortalama notu :"+c3.finalNote);
        System.out.println("Sınav ve sözlü puanı sonucu ortalamanız :"+ this.average);
    }
}
