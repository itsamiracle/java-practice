
class PopulationGrowthCalculation {

  /**
   * @param p0      starting population
   * @param percent percentage of growth over a year
   * @param aug     number of people coming to town each year
   * @param p       population to surpass
   */
  public static int nbYear(int p0, double percent, int aug, int p) {

    int yearsPassed = 0;
    double currentPopulation = p0;

    while (currentPopulation <= p) {
      currentPopulation = currentPopulation + (currentPopulation * (percent / 100)) + aug;
      yearsPassed += 1;
      }
    return yearsPassed;
    }

  public static void main(String[] args) {
    // 15
    System.out.println(nbYear(1500, 5, 100, 5000));
  }
}
