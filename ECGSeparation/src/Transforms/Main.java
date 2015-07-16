package Transforms;


public class Main {


  public static void main(String[] args) {

    double[][] input = new double[][] {
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {1,2,3,4,5,6,7,8.12314324,9,10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10},
            {-1,-2,-3,-4,-5,-6,-7,-8.12314324,-9,-10}};
    double[][] output = FastICA.fastICA(input, 5, 10, 2);
    for(int i = 0; i < output.length; i ++){
        for(int j = 0; j < output[i].length; j++){
          System.out.print(output[i][j]);
        }
      System.out.println();
    }
  }
}

