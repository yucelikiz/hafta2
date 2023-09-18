public class palindromSayilar {
    //Bu bölümde isPalidrom adında bir method oluşturup, sayıların palindrom durumlarını sorgulacak kod bloğunu oluşturuyoruz
    public static boolean isPalidrom (int number ){
        int temp=number, reverseNumber=0, lastDigit;

        //while ile, girdiğimiz sayının basamağı kadar işlem yapacak olan bir döngü oluşturuyoruz
        while (temp !=0) {
            lastDigit = temp % 10; //Son rakamı, girilen sayıyı 10'a bölüp kalan sayıyı lastDigit değişkenine atayarak alıyoruz
            reverseNumber = (reverseNumber * 10) + lastDigit; //Elde ettiğimiz son rakamı da tersten yazacağımız sayının ilk rakamı olarak kaydediyoruz. 10 ile çarpıyoruz çünkü her döngüde basamak gücü 10lar 100ler olarak artacak
            temp /= 10; //ilk başta girilen sayıya eşit olan temp değeri, 10 bölünerek bir basamak düşürülüyor ve sonraki döngüye geçiyor.
        }
        if (number==reverseNumber)
            return true; // Eğer tersten oluşturulan sayı ilk girilen sayıyla aynıysa, evet palindrom'dur,
        else
            return false; // aynı sayı değilse hayır değildir değerini alıyoruz.
    }


    public static void main(String[] args) {

        System.out.print(isPalidrom(101));
    }
}