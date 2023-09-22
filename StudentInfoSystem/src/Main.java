public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "555");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "000");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "11111");

        Course tarih = new Course("Tarih", "101", "TRH", t1);
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK", t2);
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "103", "BIO", t3);
        biyoloji.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "01", "4",tarih, fizik,biyoloji);
        s1.addBulkExamNote(10,50,78);
        s1.addBulkVerbalNote(50,75,90);
        s1.finalNote(tarih.finalNote, fizik.finalNote, biyoloji.finalNote );
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "02", "3", tarih, fizik, biyoloji);
        s2.addBulkExamNote(67,34,90);
        s2.addBulkVerbalNote(80,90,95);
        s2.finalNote(tarih.finalNote, fizik.finalNote, biyoloji.finalNote);
        s2.isPass();
    }
}