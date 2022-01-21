package OgrBilgiSistemi;

public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    public Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya, int matSoz, int fizikSoz, int kimyaSoz) {
        if (mat >= 0 && mat <= 100) {
            double resultMat = (mat * 0.80) + (matSoz * 0.20);
            this.mat.note = (int) resultMat;
        }

        if (fizik >= 0 && fizik <= 100) {
            double resultFizik = (fizik * 0.80) + (fizikSoz * 0.20);
            this.fizik.note = (int) resultFizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            double resultKimya = (kimya * 0.80) + (kimyaSoz * 0.20);
            this.kimya.note = (int) resultKimya;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.mat.note + this.fizik.note + this.kimya.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }
}
