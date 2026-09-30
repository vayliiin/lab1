public class Main{
    public static double cal(short n, float x){
        if(n == 8){
            return Math.sin(Math.asin(Math.pow((x + 0.5) / 15.0, 2)));
        }else if(n == 3 || n == 4 || n == 5 || n == 11 || n == 12 || n == 16 || n == 17 || n == 18){
            return Math.cbrt(Math.asin(Math.sin(x)));
        }else{
            double a = 3.0 / Math.log(Math.sqrt(Math.pow(Math.sin(x), 2)));
            double b = Math.sin(Math.atan(Math.exp(-Math.abs(x))));
            double c = Math.pow(a, b);
            return c;
        }
    }

    public static void matrix(double[][] e){
        for(int i = 0; i < 16; i++){
            for(int j = 0; j < 11; j++){
                System.out.printf("%.4f ", e[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        short[] n = new short[16];
        for(int i = 0; i < 16; i++){
            n[i] = (short)(i + 3);
        }

        float[] x = new float[11];
        for(int i = 0; i < 11; i++){
            x[i] = -7.0f + (float)(Math.random() * 15);
        }

        double[][] e = new double[16][11];
        
        for(int i = 0; i < 16; i++){
            for(int j = 0; j < 11; j++){
                e[i][j] = cal(n[i], x[j]);
            }
        }
        matrix(e);
    }
}
