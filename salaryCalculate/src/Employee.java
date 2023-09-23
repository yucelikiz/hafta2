public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee (String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary>1000) {
            return this.salary * 0.03;
        } else {
            return 0;
        }
    }

    public double bonus() {
       if (this.workHours>40) {
            return (this.workHours-40)*30;
       } else {
           return 0;
       }
    }

    public double raiseSalary () {
        int thisYear = 2021;
        if (thisYear-this.hireYear<10){
            return this.salary * 0.05;
        } else if (thisYear-this.hireYear >9 && thisYear-this.hireYear<20) {
            return this.salary * 0.10;
        } else if (thisYear-this.salary > 19) {
            return this.salary * 0.15;
        }else {
            return 0;
        }
    }

    public double netSalary () {
        return this.salary + this.bonus() - this.tax();
    }

    public double totalSalary () {
        return this.netSalary()+this.raiseSalary();
    }

    public String toString () {
        return "Name :"+ this.name
                +"\nMaaşı :"+ this.salary
                +"\nÇalışma Saati :"+this.workHours
                +"\nBaşlangıç Yılı :"+this.hireYear
                +"\nVergi :"+ tax()
                +"\nBonus :"+ bonus()
                +"\nMaaş Artışı :"+ raiseSalary()
                +"\nVergi ve Bonuslar ile birlikte maaş :"+ netSalary()
                +"\nToplam Maaş :"+ totalSalary();
    }

}
