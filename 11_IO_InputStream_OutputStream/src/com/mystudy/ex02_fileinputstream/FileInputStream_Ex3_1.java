package com.mystudy.ex02_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStream_Ex3_1 {

	public static void main(String[] args) {
		File file = new File("file/test_01.txt");
		FileInputStream fis = null;
		
		try {
			//1. 객체 생성(파일 읽기용) <- File 객체 입력받음
			fis = new FileInputStream(file);
			
			//2. 객체사용 작업 처리(읽기)
			byte[] bytes = new byte[10];
			System.out.println("bytes : " + Arrays.toString(bytes));
			
			
			System.out.println("--- 1번째 읽기 ---");
			int byteCnt = fis.read(bytes); //리턴값 : 데이터 읽은 갯수
			System.out.println("byteCnt : " + byteCnt);
			System.out.println("bytes : " + Arrays.toString(bytes));
			for (int i = 0; i < byteCnt; i++) {
				System.out.println("숫자 : " + bytes[i]
						+ ", char : " + (char)bytes[i]);
			}
			System.out.println("--- 2번째 읽기 ---");
			byteCnt = fis.read(bytes);
			System.out.println("byteCnt : " + byteCnt);
			System.out.println("bytes : " + Arrays.toString(bytes));
			for (int i = 0; i < byteCnt; i++) {
				System.out.println("숫자 : " + bytes[i]
						+ ", char : " + (char)bytes[i]);
			}
			
			System.out.println("--- 3번째 읽기 ---");
			byteCnt = fis.read(bytes);
			System.out.println("byteCnt : " + byteCnt);
			System.out.println("bytes : " + Arrays.toString(bytes));
			for (int i = 0; i < byteCnt; i++) {
				System.out.println("숫자 : " + bytes[i]
						+ ", char : " + (char)bytes[i]);
			}
			
			System.out.println("--- 4번째 읽기 ---");
			byteCnt = fis.read(bytes);
			System.out.println("byteCnt : " + byteCnt);
			System.out.println("bytes : " + Arrays.toString(bytes));
			for (int i = 0; i < byteCnt; i++) {
				System.out.println("숫자 : " + bytes[i]
						+ ", char : " + (char)bytes[i]);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 객체 close
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}			
		}
	}

}










