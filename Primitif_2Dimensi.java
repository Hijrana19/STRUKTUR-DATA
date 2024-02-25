package Projek;

public class Primitif_2Dimensi {
    public static void main(String[] args) {
        //1. Tipe Data Integer
        int [][] nilaiint = new int[2][2];
        nilaiint [0][0] = 12;
        nilaiint [0][1] = 10;
        nilaiint [1][0] = 10;
        nilaiint [1][1] = 10;
        System.out.println("Nilai Array Integer 0.0 = " + nilaiint[0][0]);
        
        //2. Tipe Data Float
        float [][] nilaifloat = new float[2][2];
        nilaifloat [0][0] = 12.2f;
        nilaifloat [0][1] = 10.1f;
        nilaifloat [1][0] = 10.1f;
        nilaifloat [1][1] = 10.5f;
        System.out.println("Nilai Array Float 0.1 = " + nilaifloat[0][1]);
        
        //3. Tipe Data Byte
        byte [][] nilaibyte = new byte[2][2];
        nilaibyte [0][0] = 12;
        nilaibyte [0][1] = 10;
        nilaibyte [1][0] = 10;
        nilaibyte [1][1] = 10;
        System.out.println("Nilai Array Byte 0.0 = " + nilaibyte[0][0]);
        
        //4. Tipe Data Short
        short [][] nilaishort = new short[2][2];
        nilaishort [0][0] = 2021;
        nilaishort [0][1] = 2022;
        nilaishort [1][0] = 2023;
        nilaishort [1][1] = 2024;
        System.out.println("Nilai Array Short 0.0 = " + nilaishort[0][0]);
        
        //5. Tipe Data Long
        long [][] nilailong = new long[2][1];
        nilailong [0][0] = 12334;
        nilailong [1][0] = 234;
        System.out.println("Nilai Array Long 0.0 = " + nilailong[0][0]);
        
        //6. Tipe Data Double
        double [][] nilaidouble = new double[2][2];
        nilaidouble [0][0] = 12.2;
        nilaidouble [0][1] = 10.1;
        nilaidouble [1][0] = 10.2;
        nilaidouble [1][1] = 10.3;
        System.out.println("Nilai Array Double 0.0 = " + nilaibyte[0][0]);
        
        //7. Tipe Data Char
        char [][] nilaichar = new char[2][2];
        nilaichar [0][0] = 'A';
        nilaichar [0][1] = 'B';
        nilaichar [1][0] = 'C';
        nilaichar [1][1] = 'D';
        System.out.println("Nilai Array Char 0.0 = " + nilaichar[0][0]);
        
        //8. Tipe Data Boolean
        boolean [][] nilaibool = {
            {false},{true},{false}
        };
        System.out.println("Nilai Array Boolean = " + nilaibool[1][0]);
        
        
    }
}
