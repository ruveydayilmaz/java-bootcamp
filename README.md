<body>
  <header><h1 class="page-title">Java - Engin Demiroğ</h1></header>
  <details>
    <summary><h1>1.Ders</h1></summary>
  </details>
 <h3>Metinsel Türler</h3>
 <pre><code>
 pubic class Main {
    // iki slash yorum satırı demektir. burada yazılanlar kodu etkilemez.
    // main javada başlangıç noktasıdır
    public static void main(String[] args) {
	    System.out.println(&quot;Hello world&quot;); // console&#x27;a Hello world yazdırır		
      // değişken isimlendirmeleri Java&#x27;da camelCase yazılır. İlk kelimenin ilk harfi küçük, sonraki kelimelerin ilk harfi büyük yazılır.
	    String ortaMetin = &quot;İlginizi çekebilir&quot;;
      // String x = &quot;&quot; : x isimli metinsel türde bir veri tutulacağı anlamına gelir.
	    System.out.println(ortaMetin); // değişken yazdırılırken &quot;&quot; kullanılmaz.
	  }
  }
</code>
</pre>
<figure><div style="font-size:1.5em">⚠️Programlar yukarıdan aşağı doğru okunur.</div></figure>
<h3>Sayısal Türler</h3>
<pre>
  <code>
    pubic class Main {
	    // main javada başlangıç noktasıdır
	    public static void main(String[] args) {
		    int vade = 12; // int tam sayı türünde bir değişken oluşturmak için kullanılır.
		    double dolarDun = 18.15; // double ondalıklı sayı türünde değişken oluşturmak için kullanılır.
		    double dolarBugun = 18.10;
		    boolean dolarDustuMu = true; // boolean ya true ya da false olabilir.
	    }
    }
</code>
</pre>
<h3>Şart Blokları</h3>
<pre><code>
  pubic class Main {
	  // main javada başlangıç noktasıdır
	  public static void main(String[] args) {
		  int vade = 12;
		  double dolarDun = 18.15;
		  double dolarBugun = 18.10;
		  boolean dolarDustuMu = true;
		  String okYonu = &quot;&quot;;
		  if(dolarBugun &lt; dolarDun) { // eğer if()&#x27;in içindeki true dönüyorsa if bloğu çalışır, false dönüyorsa else bloğu çalışır.
			  // dolarBugun dolarDun&#x27;den küçük ifadesi doğruysa burası çalışır
			  okYonu = &quot;down.svg&quot;;
			  System.out.println(okYonu);
		  } else {
			  // dolarBugun dolarDun&#x27;den küçük ifadesi yanlışsa burası çalışır
			  okYonu = &quot;up.svg&quot;;
			  System.out.println(okYonu);
		  }
	  }
  }

// çıktı: down.svg</code></pre>
<pre id="a453e39e-6bd5-4326-99c9-652d5021a68a" class="code code-wrap"><code>
  pubic class Main {
	  // main javada başlangıç noktasıdır
	  public static void main(String[] args) {
      int vade = 12;
      double dolarDun = 18.15;
      double dolarBugun = 18.20;
      boolean dolarDustuMu = true;
      String okYonu = &quot;&quot;;
      if(dolarBugun &lt; dolarDun) {
        okYonu = &quot;down.svg&quot;;
        System.out.println(okYonu);
      else if(dolarBugun &gt; dolarDun) { // else if başka bir şart bloğu eklemek için kullanılır.
        okYonu = &quot;up.svg&quot;;
        System.out.println(okYonu);	
      }
      } else {
        okYonu = &quot;equal.svg&quot;;
        System.out.println(okYonu);
      }
	  }
  }

// çıktı: up.svg</code></pre><h3 id="536fa71d-359b-4f9b-95bd-afce4fe2e71e" class="">Liste Türü</h3><pre id="08c491fd-087e-4d4e-8271-8fce84789fec" class="code code-wrap"><code>pubic class Main {
	// main javada başlangıç noktasıdır
	public static void main(String[] args) {
		String[] krediler = {&quot;Hızlı Kredi&quot;,&quot;Maaşını Halkbank&#x27;tan&quot; ,&quot;Mutlu Emekli&quot;}; // köşeli parantez onun bir liste yani array olduğunu gösterir.

		System.out.println(krediler[0]); // krediler dizisinin 0.elemanı
		System.out.println(krediler[1]); // krediler dizisinin 1.elemanı
		System.out.println(krediler[2]); // krediler dizisinin 2.elemanı
		
	}
}

// çıktı :
// Hızlı Kredi
// Maaşını Halkbank&#x27;tan
// Mutlu Emekli</code></pre><figure class="block-color-yellow callout" style="white-space:pre-wrap;display:flex" id="5388e60a-bb7b-4e34-ab4e-3905f79ad960"><div style="font-size:1.5em"><span class="icon">⚠️</span></div><div style="width:100%">Kodlamada saymaya 0’Dan başlanır yani bir dizinin ilk elemanı 0. eleman olur.</div></figure><h3 id="c159afef-c23b-4851-aa08-1df2c041064d" class="">Döngüler</h3><pre id="f70ac32c-98ea-4941-8820-3978830f152b" class="code code-wrap"><code>pubic class Main {
	// main javada başlangıç noktasıdır
	public static void main(String[] args) {
		String[] krediler = {&quot;Hızlı Kredi&quot;,&quot;Maaşını Halkbank&#x27;tan&quot; ,&quot;Mutlu Emekli&quot;};

		for(int i = 0; i &lt; krediler.length; i++) {
			// i = 0 &#x27;dan krediler dizisinin uzunluğuna kadar i&#x27;yi bir arttır. her biri için for&#x27;un içindeki kodu çalıştır.
			System.out.println(krediler[i]); // i = 0 için krediler[0], i = 1 için krediler[1], i = 2 için krediler[2], i = 3 olamaz çünkü 3 krediler dizisinin boyutundan(3) küçük değil. döngü bitti 
		}
	}
}

// çıktı :
// Hızlı Kredi
// Maaşını Halkbank&#x27;tan
// Mutlu Emekli</code></pre><p id="f25c4540-3524-4b4b-b33c-c74d5c6d9e48" class="">
</p></div><h1 id="de5d4f6e-eeee-4d44-b04d-73ddd44d78e2" class=""><details open=""><summary>2.Ders</summary></details></h1><div class="indented"><h2 id="e5549265-c933-45ef-a476-f90ef5805827" class="">Object Oriented Programming (OOP)</h2><p id="ac6337c9-8142-4d9e-b495-8f3ff166b24a" class="">Java, nesne güdümlü bir programlama dilidir. </p><p id="567881aa-95cb-46c0-8e43-ccacf351f96d" class="">Günlük hayatta konuşurken “ben bir kahve makinesi aldım.” şeklinde ismi üzerinden gidilir. Bu şekilde konuşulduğu için “kahve makinesi” bilgisinin ürünün kendisi olduğunu zannederiz. Ancak o ürünü (<strong>nesne</strong>) ürün yapan sadece ismi değil fiyatı, imajı, satıcısı, değerlendirme puanı, indirim oranı gibi bilgiler de ürünün bir parçasıdır. Bu nesnelere <strong>class </strong>denir. İki tip class bulunur: özellik tutucu, operasyon tutucu</p><pre id="89d53add-2c6c-4caa-b193-7b1f084772cb" class="code code-wrap"><code>// -- Product.java --
// class isimlendirilirken ilk harfi büyük yazılır. (PascalCase)
// ürünü tanımlayacak ortamı(şablonu) hazırlıyoruz : 
public class Product {  // Product adında bir class oluşturduk
	String name;  // field&#x27;lar camelCase yazılır
	double unitPrice;
	double discount;
	String imageUrl;
	int unitsInStock;
}</code></pre><pre id="c652c3ac-2177-435b-9167-b20c8ecd5322" class="code code-wrap"><code>// -- Main.java --
public class Main{ 
	public static void main(String[] args) {
		Product product1 = new Product();  // Product diye bir veri tipi yukarıda tanımlamıştık. onu kullanıyoruz. class değişkeni bu şekilde oluşturulur.
		product1.name = &quot;Delonghi Kahve Makinesi&quot;;
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.imageUrl = &quot;bilmemne.jpg&quot;;
		product1.unitsInStock = 3;

		System.out.println(product1.name);
	}
}

// çktı: Delonghi Kahve Makinesi</code></pre><pre id="e5082760-556c-41f1-b5b8-fa1d88482561" class="code code-wrap"><code>// -- Main.java --
public class Main{ 
	public static void main(String[] args) {
		Product product1 = new Product();
		product1.name = &quot;Delonghi Kahve Makinesi&quot;;
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.imageUrl = &quot;bilmemne.jpg&quot;;
		product1.unitsInStock = 3;

		Product product2 = new Product();
		product2.name = &quot;Smeg Kahve Makinesi&quot;;
		product2.unitPrice = 6500;
		product2.discount = 8;
		product2.imageUrl = &quot;bilmemne2.jpg&quot;;
		product2.unitsInStock = 3;

		Product product3 = new Product();
		product3.name = &quot;Kitchen Aid Kahve Makinesi&quot;;
		product3.unitPrice = 4500;
		product3.discount = 7;
		product3.imageUrl = &quot;bilmemne3.jpg&quot;;
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
// Kitchen Aid Kahve Makinesi</code></pre><figure class="block-color-yellow callout" style="white-space:pre-wrap;display:flex" id="8fc942bc-6d20-406f-852a-ec67d2fe6369"><div style="font-size:1.5em"><span class="icon">⚠️</span></div><div style="width:100%">Bir verinin sadece okunabilmesi gibi durumları sonradan ekleyebilmek için field’lar private yapılır.</div></figure><pre id="7e1d4fcb-4925-4035-9368-345e07b4cce1" class="code code-wrap"><code>// -- Product.java --
public class Product {
	private String name;  // private field sadece o class&#x27;ın içinde kullanılabilir demek
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitsInStock;
}</code></pre><figure class="block-color-yellow callout" style="white-space:pre-wrap;display:flex" id="5e918f31-1286-4a87-ac37-9867f4c17f4b"><div style="font-size:1.5em"><span class="icon">⚠️</span></div><div style="width:100%">Veriler artık private olduğu için verilere Main.java’da önceki gibi erişim sağlayamıyoruz. Önceki gibi direkt erişmek yerine get ve set’i kullanacağız.</div></figure><pre id="1dc91970-0cdd-44f1-baed-68d420604fdf" class="code code-wrap"><code>// -- Product.java --
public class Product {
	private String name;  // private field sadece o class&#x27;ın içinde kullanılabilir demek
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitsInStock;

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	.
	.
	. // tüm field&#x27;lar için bu şekilde get ve set fonksiyonları oluşturulur
	// set oluşturmazsak bu field yazılamaz demektir
}</code></pre><pre id="a3aea8f2-eda2-40df-9756-b8e06b91b40c" class="code code-wrap"><code>// -- Main.java --
public class Main{ 
	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setName(&quot;Delonghi Kahve Makinesi&quot;);  // yazmak için set kullanılır
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setImageUrl(&quot;bilmemne.jpg&quot;);
		product1.setUnitsInStock(3);

		System.out.println(product1.getName());  // okumak için get kullanılır
	}
}

// çktı: Delonghi Kahve Makinesi</code></pre><p id="bcfc72b3-4a37-4aae-8904-1945ae4cb26b" class="">
</p><h2 id="12f62072-93b6-477e-b493-359a85869a94" class="">Inheritance (Soyutlama)</h2><p id="fda30c41-ee43-45d8-840e-f237413eea59" class="">Programlamada sürdürülebilirlik diye bir konu vardır ve bu Nesne Yönelimli Programlama’yla sağlanır. Burada en önemli konulardan biri Inheritance yani Soyutlama’dır.</p><pre id="53d472e7-5eae-4188-8f01-c2c8642205d6" class="code code-wrap"><code>// -- Customer.java --
public class Customer {
	private int id;
	private String customerNumber;  // üzerinde işlem yapılmayanlar string tanımlanır
	private String phone;
	
	public void setId(int id) {this.id = id;}
	public String getCustomerNumber() {return customerNumber;}
	public void setCustomerNumber(String customerNumber) {this.customerNumber= customerNumber;}
	.
	.

}</code></pre><pre id="d0896109-b7a1-45bd-a5d4-2d4e37aed7f9" class="code code-wrap"><code>// -- IndividualCustomer.java --
public class IndividualCustomer extends Customer { // &quot;IndividualCustomer is a Customer&quot;
	private String firstName;
	private String lastName;
	
	public String getfirstName() {return firstName;}
	public void setFirstName(String firstName) {this.firstName= firstName;}
	.
	.

}</code></pre><pre id="3adaa4ec-341a-4424-b907-1a4ffd8793d8" class="code code-wrap"><code>// -- CorporateCustomer.java --
public class CorporateCustomer extends Customer {
	private String companyName;
	private String taxNumber;
	
	public String getCompanyName() {return companyName;}
	public void setCompanyName(String companyName) {this.companyName= companyName;}
	.
	.

}</code></pre><pre id="d68aaac2-7349-4619-aaf7-bdeb4612f19c" class="code code-wrap"><code>// -- Main.java --
public class Main{ 
	public static void main(String[] args) {
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1); // individualCustomer da bir Customer olduğundan Customer class&#x27;ının field&#x27;larını da içerir
		individualCustomer.setPhone(&quot;5476857590&quot;);
		individualCustomer.setCustomerNumber(&quot;12345&quot;);
		individualCustomer.setFirstName(&quot;Engin&quot;);
		individualCustomer.setLastName(&quot;Demiroğ&quot;);

		CorporateCustomer corporateCustomer= new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone(&quot;5439628504&quot;);
		corporateCustomer.setCustomerNumber(&quot;54321&quot;);
		corporateCustomer.setCompanyName(&quot;Kodlama.io&quot;);
		corporateCustomer.setTaxNumber(&quot;11111111111&quot;);

		Customer[] customers = {individualCustomer, corporateCustomer};

	}
}</code></pre></div><h1 id="c37c74fa-f629-415e-8482-7e3d6826440d" class=""><details open=""><summary>3.Ders</summary></details></h1><div class="indented"><h2 id="45d46bee-8eee-4c68-86dc-1263d38c2587" class="">Class &amp; Interface ile Sürdürebilirlik</h2><p id="a974bc41-4eb6-4dce-ae03-2c40883316c0" class="">Katmanlar:</p><ol type="1" id="c04eb52e-efe3-4bdb-8170-3eeb4c0de7bd" class="numbered-list" start="1"><li>Data Access</li></ol><ol type="1" id="2a4f7d21-1884-49ed-a80c-a6d161aa1e5e" class="numbered-list" start="2"><li>Business</li></ol><ol type="1" id="220aeccd-92e0-4ac4-80cd-d108b826ad28" class="numbered-list" start="3"><li>UI</li></ol><p id="9259d3d8-8c60-4339-9499-889d1e71bf30" class="">
</p><p id="3dd50214-dea7-4c4e-90f6-6fc6ed0b2e50" class="">Niye böyle bir yapı kullanılır? Mantıksal parçalara bölerek daha kolay yönetmek ve sürdürebilirlik</p><pre id="0d9b52ee-9a6a-4b32-878c-faf0a3373ed0" class="code code-wrap"><code>// -- Main.java --
public class Main{ 
	public static void main(String[] args) {

	}
}</code></pre><p id="c3428c9b-0445-4d54-aa1f-04f723f30841" class="">
</p></div></div></article></body>
