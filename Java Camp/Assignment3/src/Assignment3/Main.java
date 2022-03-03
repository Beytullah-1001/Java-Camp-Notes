package Assignment3;

import Assignment3.Business.Abstract.CustomerCheckService;
import Assignment3.Business.Concrete.CustomerCheckManager;
import Assignment3.Business.Concrete.CustomerManager;
import Assignment3.Business.Concrete.DatabaseLogger;
import Assignment3.Entities.Concrete.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		CustomerManager customerManager=new CustomerManager(new CustomerCheckManager(),new DatabaseLogger());
		Customer customer1=new Customer(1,"Beytullah","Yayla","26/02/2002","48835155908");
		customerManager.addCustomer(customer1);

	}

}

//1.     Oyuncular�n sisteme kay�t olabilece�i, bilgilerini g�ncelleyebilece�i, kay�tlar�n� silebilece�i bir ortam� simule ediniz. M��teri bilgilerinin do�rulu�unu e-devlet sistemlerini kullanarak do�rulama yapmak istiyoruz. (E-devlet sistemlerinde do�rulama TcNo, Ad, Soyad, Do�umY�l� bilgileriyle yap�l�r. Bunu yapacak servisi simule etmeniz yeterlidir.) (Loglama gibi)

//2.     Oyun sat��� yap�labilecek sat�� ortam�n� simule ediniz.( Yap�lan sat��lar oyuncu ile ili�kilendirilmelidir. Oyuncunun parametre olarak metotta olmas�n� kastediyorum.)

//3.     Sisteme yeni kampanya giri�i, kampanyan�n silinmesi ve g�ncellenmesi imkanlar�n� simule ediniz.

//4.     Sat��larda kampanya entegrasyonunu simule ediniz.

//5.     �devinizi Github�a y�kleyiniz. Github linkinizi payla��n�z.

//6. Di�er arkada�lar�n�n�z Github kodlar�n� inceleyiniz. Ona y�ld�z vermeyi unutmay�n�z :)