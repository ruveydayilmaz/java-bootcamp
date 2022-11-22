# 1.Ders

### Metinsel Türler

```java
pubic class Main {
	// iki slash yorum satırı demektir. burada yazılanlar kodu etkilemez.
	// main javada başlangıç noktasıdır
	public static void main(String[] args) {
		System.out.println("Hello world"); // console'a Hello world yazdırır
		
		// değişken isimlendirmeleri Java'da camelCase yazılır. İlk kelimenin ilk harfi küçük, sonraki kelimelerin ilk harfi büyük yazılır.
		String ortaMetin = "İlginizi çekebilir";
		// String x = "" : x isimli metinsel türde bir veri tutulacağı anlamına gelir.
		System.out.println(ortaMetin); // değişken yazdırılırken "" kullanılmaz.
	}
}
```

⚠️ Programlar yukarıdan aşağı doğru okunur.

### Sayısal Türler

```java
pubic class Main {
	// main javada başlangıç noktasıdır
	public static void main(String[] args) {
		int vade = 12; // int tam sayı türünde bir değişken oluşturmak için kullanılır.
		double dolarDun = 18.15; // double ondalıklı sayı türünde değişken oluşturmak için kullanılır.
		double dolarBugun = 18.10;
		boolean dolarDustuMu = true; // boolean ya true ya da false olabilir.
	}
}
```

### Şart Blokları

```java
pubic class Main {
	// main javada başlangıç noktasıdır
	public static void main(String[] args) {
		int vade = 12;
		double dolarDun = 18.15;
		double dolarBugun = 18.10;
		boolean dolarDustuMu = true;
		String okYonu = "";

		if(dolarBugun < dolarDun) { // eğer if()'in içindeki true dönüyorsa if bloğu çalışır, false dönüyorsa else bloğu çalışır.
			// dolarBugun dolarDun'den küçük ifadesi doğruysa burası çalışır
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else {
			// dolarBugun dolarDun'den küçük ifadesi yanlışsa burası çalışır
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
	}
}

// çıktı: down.svg
```

```java
pubic class Main {
	// main javada başlangıç noktasıdır
	public static void main(String[] args) {
		int vade = 12;
		double dolarDun = 18.15;
		double dolarBugun = 18.20;
		boolean dolarDustuMu = true;
		String okYonu = "";

		if(dolarBugun < dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		else if(dolarBugun > dolarDun) { // else if başka bir şart bloğu eklemek için kullanılır.
			okYonu = "up.svg";
			System.out.println(okYonu);	
		}
		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
	}
}

// çıktı: up.svg
```

### Liste Türü

```java
pubic class Main {
	// main javada başlangıç noktasıdır
	public static void main(String[] args) {
		String[] krediler = {"Hızlı Kredi","Maaşını Halkbank'tan" ,"Mutlu Emekli"}; // köşeli parantez onun bir liste yani array olduğunu gösterir.

		System.out.println(krediler[0]); // krediler dizisinin 0.elemanı
		System.out.println(krediler[1]); // krediler dizisinin 1.elemanı
		System.out.println(krediler[2]); // krediler dizisinin 2.elemanı
		
	}
}

// çıktı :
// Hızlı Kredi
// Maaşını Halkbank'tan
// Mutlu Emekli
```

⚠️ Kodlamada saymaya 0’Dan başlanır yani bir dizinin ilk elemanı 0. eleman olur.

### Döngüler

```java
pubic class Main {
	// main javada başlangıç noktasıdır
	public static void main(String[] args) {
		String[] krediler = {"Hızlı Kredi","Maaşını Halkbank'tan" ,"Mutlu Emekli"};

		for(int i = 0; i < krediler.length; i++) {
			// i = 0 'dan krediler dizisinin uzunluğuna kadar i'yi bir arttır. her biri için for'un içindeki kodu çalıştır.
			System.out.println(krediler[i]); // i = 0 için krediler[0], i = 1 için krediler[1], i = 2 için krediler[2], i = 3 olamaz çünkü 3 krediler dizisinin boyutundan(3) küçük değil. döngü bitti 
		}
	}
}

// çıktı :
// Hızlı Kredi
// Maaşını Halkbank'tan
// Mutlu Emekli
```

# 2.Ders

## Object Oriented Programming (OOP)

Java, nesne güdümlü bir programlama dilidir. 

Günlük hayatta konuşurken “ben bir kahve makinesi aldım.” şeklinde ismi üzerinden gidilir. Bu şekilde konuşulduğu için “kahve makinesi” bilgisinin ürünün kendisi olduğunu zannederiz. Ancak o ürünü (**nesne**) ürün yapan sadece ismi değil fiyatı, imajı, satıcısı, değerlendirme puanı, indirim oranı gibi bilgiler de ürünün bir parçasıdır. Bu nesnelere **class** denir. İki tip class bulunur: özellik tutucu, operasyon tutucu

```java
// -- Product.java --
// class isimlendirilirken ilk harfi büyük yazılır. (PascalCase)
// ürünü tanımlayacak ortamı(şablonu) hazırlıyoruz : 
public class Product {  // Product adında bir class oluşturduk
	String name;  // field'lar camelCase yazılır
	double unitPrice;
	double discount;
	String imageUrl;
	int unitsInStock;
}
```

```java
// -- Main.java --
public class Main{ 
	public static void main(String[] args) {
		Product product1 = new Product();  // Product diye bir veri tipi yukarıda tanımlamıştık. onu kullanıyoruz. class değişkeni bu şekilde oluşturulur.
		product1.name = "Delonghi Kahve Makinesi";
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.imageUrl = "bilmemne.jpg";
		product1.unitsInStock = 3;

		System.out.println(product1.name);
	}
}

// çktı: Delonghi Kahve Makinesi
```

```java
// -- Main.java --
public class Main{ 
	public static void main(String[] args) {
		Product product1 = new Product();
		product1.name = "Delonghi Kahve Makinesi";
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.imageUrl = "bilmemne.jpg";
		product1.unitsInStock = 3;

		Product product2 = new Product();
		product2.name = "Smeg Kahve Makinesi";
		product2.unitPrice = 6500;
		product2.discount = 8;
		product2.imageUrl = "bilmemne2.jpg";
		product2.unitsInStock = 3;

		Product product3 = new Product();
		product3.name = "Kitchen Aid Kahve Makinesi";
		product3.unitPrice = 4500;
		product3.discount = 7;
		product3.imageUrl = "bilmemne3.jpg";
		product3.unitsInStock = 3;

		Product[] products = {product1, product2, product3}; // products dizine eklendi

		for(Product product : products) {  // products dizisini tek tek gez demek
			System.out.println(product.name);
		}
	}
}

// çktı: 
// Delonghi Kahve Makinesi
// Smeg Kahve Makinesi
// Kitchen Aid Kahve Makinesi
```

⚠️ Bir verinin sadece okunabilmesi gibi durumları sonradan ekleyebilmek için field’lar private yapılır.

```java
// -- Product.java --
public class Product {
	private String name;  // private field sadece o class'ın içinde kullanılabilir demek
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitsInStock;
}
```

⚠️ Veriler artık private olduğu için verilere Main.java’da önceki gibi erişim sağlayamıyoruz. Önceki gibi direkt erişmek yerine get ve set’i kullanacağız.

```java
// -- Product.java --
public class Product {
	private String name;  // private field sadece o class'ın içinde kullanılabilir demek
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitsInStock;

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	.
	.
	. // tüm field'lar için bu şekilde get ve set fonksiyonları oluşturulur
	// set oluşturmazsak bu field yazılamaz demektir
}
```

```java
// -- Main.java --
public class Main{ 
	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");  // yazmak için set kullanılır
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setImageUrl("bilmemne.jpg");
		product1.setUnitsInStock(3);

		System.out.println(product1.getName());  // okumak için get kullanılır
	}
}

// çktı: Delonghi Kahve Makinesi
```

## Inheritance (Soyutlama)

Programlamada sürdürülebilirlik diye bir konu vardır ve bu Nesne Yönelimli Programlama’yla sağlanır. Burada en önemli konulardan biri Inheritance yani Soyutlama’dır.

```java
// -- Customer.java --
public class Customer {
	private int id;
	private String customerNumber;  // üzerinde işlem yapılmayanlar string tanımlanır
	private String phone;
	
	public void setId(int id) {this.id = id;}
	public String getCustomerNumber() {return customerNumber;}
	public void setCustomerNumber(String customerNumber) {this.customerNumber= customerNumber;}
	.
	.

}
```

```java
// -- IndividualCustomer.java --
public class IndividualCustomer extends Customer { // "**IndividualCustomer** is a **Customer**"
	private String firstName;
	private String lastName;
	
	public String getfirstName() {return firstName;}
	public void setFirstName(String firstName) {this.firstName= firstName;}
	.
	.

}
```

```java
// -- CorporateCustomer.java --
public class CorporateCustomer extends Customer {
	private String companyName;
	private String taxNumber;
	
	public String getCompanyName() {return companyName;}
	public void setCompanyName(String companyName) {this.companyName= companyName;}
	.
	.

}
```

```java
// -- Main.java --
public class Main{ 
	public static void main(String[] args) {
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1); // individualCustomer da bir Customer olduğundan Customer class'ının field'larını da içerir
		individualCustomer.setPhone("5476857590");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroğ");

		CorporateCustomer corporateCustomer= new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("5439628504");
		corporateCustomer.setCustomerNumber("54321");
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setTaxNumber("11111111111");

		Customer[] customers = {individualCustomer, corporateCustomer};

	}
}
```

# 3.Ders

## Class & Interface ile Sürdürebilirlik

#### Katmanlar:

1. Data Access
2. Business
3. UI

Niye böyle bir yapı kullanılır? Mantıksal parçalara bölerek daha kolay yönetmek ve sürdürebilirlik
```
// -- Main.java --
public class Main{ 
	public static void main(String[] args) {

	}
}
```
