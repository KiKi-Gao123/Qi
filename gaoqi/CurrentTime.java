package gaoqi;

import java.util.Date;

public class CurrentTime {

    public static void main(String[] args) {
        //String,StringBuilder,StringBufferʱ��Ƚ�
        //String
        String str = "";//�������ַ���
        long starTime = System.currentTimeMillis();//�����ַ���ִ�в����Ŀ�ʼʱ��
        for(int i = 0;i<10000;i++) {//forѭ��
            str=str+i;//ѭ��׷���ַ���
        }
        long endTime = System.currentTimeMillis();//�����ַ���ִ�в����Ľ���ʱ��
        long time = endTime - starTime;//������ַ�������ǰ���ʱ��
        System.out.println("String��ִ��ʱ��Ϊ��"+time);//��ӡ�����

        //StringBuilder
        StringBuilder std = new StringBuilder();//�����ַ���������
         starTime = System.currentTimeMillis();//�����ַ���ִ�в����Ŀ�ʼʱ��
        for(int i = 0;i<10000;i++) {//forѭ��
            std.append(i);//ѭ��׷���ַ���
        }
         endTime = System.currentTimeMillis();//�����ַ���ִ�в����Ľ���ʱ��
         time = endTime - starTime;//������ַ�������ǰ���ʱ��
         System.out.println("StringBuilder��ִ��ʱ��Ϊ��"+time);//��ӡ�����

        //StringBuffer
        StringBuffer stb = new StringBuffer();//�����ַ���������
         starTime = System.currentTimeMillis();//�����ַ���ִ�в����Ŀ�ʼʱ��
        for(int i = 0;i<10000;i++) {//forѭ��
            stb.append(i);//ѭ��׷���ַ���
        }
         endTime = System.currentTimeMillis();//�����ַ���ִ�в����Ľ���ʱ��
         time = endTime - starTime;//������ַ�������ǰ���ʱ��
         System.out.println("StringBuffer��ִ��ʱ��Ϊ��"+time);//��ӡ�����
    }
}