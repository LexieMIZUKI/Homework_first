package first;

import java.util.Scanner;

public class First {
	int[] change = new int[10];
	public void notice() {
		System.out.println();
		System.out.println("**************************");
		System.out.println("      1--��������");
		System.out.println("      2--��ʾ��������");
		System.out.println("      3--��ָ��λ�ò�������");
		System.out.println("      4--��ѯ�ܱ�3����������");
		System.out.println("      0--�˳�");
		System.out.println("**************************");
		System.out.println("�������Ӧ�����ֽ��в�����");
	}
	public int[] insertData() {
		int[] a= new int[10];
		Scanner scan = new Scanner(System.in);
		for(int i = 0;i < a.length-1;i++){
			System.out.println("�������"+(i+1)+"�����ݣ�");
			a[i]=scan.nextInt();
		}
		return a;
	}
	public void showData(int[] a,int length) {
		System.out.println("����Ԫ��Ϊ��");
		for(int i=0;i<length;i++){
			System.out.print(a[i]+"  ");
			}
		System.out.println();
	}
	public void insertAtArray(int[] a,int n,int k) {
		Scanner scan2 = new Scanner(System.in);
		change = new int[a.length];
		System.out.print("��������������:");
		n = scan2.nextInt();
		System.out.print("������Ҫ�����λ��:");
		k = scan2.nextInt();
		for(int i = 0;i < k;i++) {
			change[i] = a[i];
		}
		change[k-1] = n;
		for(int i = k-1;i < a.length-1;i++) {
			change[i+1] = a[i];
		}
		for(int c:change)
			System.out.print(c+"  ");
		System.out.println();
	}
	public void divThree(int[] a) {
		a = this.change;
		for(int i = 0;i < a.length;i++) {
			if(a[i] % 3 == 0) {
				System.out.print(a[i]+"  ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First one = new First();
		one.notice();
		int[] result = new int[10];
		int n = 0;
		int k = 0;
		boolean e = true;
		while(e) {
			Scanner scan = new Scanner(System.in);
			int b = scan.nextInt();
			switch(b){
				case 1:
				    result= one.insertData();
					System.out.println("����Ԫ��Ϊ��");
					for(int i=0;i<result.length-1;i++){
						System.out.print(result[i]+"  ");
						}
					System.out.println();
					one.notice();
					break;
				case 2:
					one.showData(result, 9);
					one.notice();
					break;
				case 3:
					one.insertAtArray(result, n, k);
					one.notice();
					break;
				case 4:
					System.out.println("�ܱ�3�����������У�");
					one.divThree(result);
					one.notice();
					break;
				case 0:
					e = false;
					System.out.println("�˳�����");
					break;
				default:
					e = false;
					System.out.println("�˳�����");
					break;
			}
		}
	}
}
