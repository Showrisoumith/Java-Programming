class Solution {
    public double[] convertTemperature(double celsius) {
        double[] arr = new double[2];
        arr[0] = celsius + 273.15000;
        arr[1] = (celsius * 1.80 ) + 32.00000;
        return arr;
    }
}