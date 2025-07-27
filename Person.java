public class Person {

    String ad;
    String soyad;
    int yas;

    public Person(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    void yasArtir() {
        yas++;
        System.out.println(" Ad : " + ad + " Soyad : " + soyad + " Yas : " + yas);
    }
}

// Person class yarat, constructor istifadə et, ad, soyad, yas. yasArtir() metodu ilə yaşı 1 vahid artıran metod yaz.
// ✅ Person class-ını yaratmısan
//
//✅ Constructor ilə dəyərləri vermisən
//
//✅ yasArtir() metodu ilə yaşı artırmısan