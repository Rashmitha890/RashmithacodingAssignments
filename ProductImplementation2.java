package com.javw;//Using STREAMS
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
//set 9
import java.util.stream.IntStream;
class Product {
	int id;
	String name;
	int price;
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
		}
	public int getId() {
		return id;
		}
	public void setId(int id) {
		this.id = id;
			}
	public String getName() {
		return name;
		}
	public void setName(String name) {
		this.name = name;
		}
	public int getPrice() {
		return price;
		}
	public void setPrice(int price) {
		this.price = price;
		}
	}
public class ProductImplementation2 {
	double sumOfPrice(ArrayList<Product> productList) {
		double sum=0;
		IntStream.Builder b=IntStream.builder();
		for(Product price : productList)
		{
			b.add(price.getPrice());
			}
		sum=b.build().sum();
		return sum;
		}
	float  maxPrice(ArrayList<Product> productList) {
				IntStream.Builder is=IntStream.builder();
				for(Product obj : productList)
				{
					is.add(obj.getPrice());
				}
				OptionalInt max=is.build().max();
				return max.getAsInt();
				
			}
			float  minPrice(ArrayList<Product> productList) {
				IntStream.Builder is=IntStream.builder();
				for(Product obj : productList)
				{
					is.add(obj.getPrice());
				}
				OptionalInt min=is.build().min();
				return min.getAsInt();
			}
			List<String> getProductNameList(ArrayList<Product> productList) {
				List<String> namesList=new ArrayList<String>();
				for(Product ele : productList)
				{
					namesList=productList.stream().map(x->x.name).collect(Collectors.toList());
				}
				
				return namesList;
			}
			public static void main(String[] args) {
				ArrayList plist=new ArrayList<Product>();
				plist.add(new Product(20,"Bag",897));
				plist.add(new Product(21,"Book",87));
				plist.add(new Product(22,"Table",89));
				plist.add(new Product(23,"pen",597));
				ProductImplementation2 pa=new ProductImplementation2();
				System.out.println(pa.getProductNameList(plist));
				System.out.println(pa.sumOfPrice(plist));
				System.out.println(pa.maxPrice(plist));
				System.out.println(pa.minPrice(plist));
			}
		}
