package com.mystudy.ex02_myexception;

//���ܸ���� : Exception Ŭ������ ��ӹ޾� �����
public class MyException extends Exception {
	//������
	public MyException() {
		//����(�θ�) Ŭ������ ������ ȣ��(���� �޽��� ����)
		super(":::���� ���� Exception");
	}

}