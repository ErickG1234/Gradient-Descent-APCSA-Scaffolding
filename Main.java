// stduent code

public class Main {
    public static void main(String[] args) {
        double[] pace = {70.0, 75.0, 80.0, 85.0, 90.0, 95.0};
        double[] overallRatings = {72.0, 76.0, 81.0, 84.0, 89.0, 93.0};
        // Create two double variables, weighty and learningRate, and set them both to 0.0
        double weight = 0.0;
        double learningRate = 0.0;
    
    
    // The final training loop will go here!
    for (int i = 0; i < 100; i++) {
        weight = weight - (learningRate * calculateGradient(pace, overallRatings, weight));
        }
    }



    public static double calculateError(double[] pace, double[] overallRatings, double weight) {
        //mean Squared Error
        double totalError = 0.0;
        double error = 0.0;
        for (int i = 0; i < overallRatings.length; i++) {
            // calculate the error
            error = ((pace[i] * weight) - overallRatings[i]);
            //sqaure it
            totalError += error * error;
        }
        // divide it by 6 (amount of players)
        totalError = totalError / overallRatings.length;
        return totalError;
    }
        
        
        
    public static double calculateGradient(double[] pace, double[] overallRatings, double weight) {
        double playerGradient = 0.0;
    
        for (int i = 0; i < overallRatings.length; i++) {
                            //(prediction)         Raw Mistake          change amount             
            playerGradient += ((pace[i] *  weight) - overallRatings[i]) * pace[i];
        }
        return playerGradient / overallRatings.length;
    }
}