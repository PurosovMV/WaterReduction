package model;

public class Calculate {

        /*
         * private double waterReductionArea; // Площадь ограниченная контуром
         * водопонижения
         * private double filterDiameter; // Диаметр фильтра
         * private double markOfTheUpperWaterBarrier; // Отметка верхнего водоупора
         * private double theMarkOfTheLowerWaterBarrier;// Отметка нижнего водоупора
         * private double markOfThDowngradeLevel;// Отметка уровня понижения
         * водопонижения
         * private double markingOfTheGroundwaterLevel; // Отметка уровня подземных вод
         * private double filtrationCoefficient; // Коэффициент фильтрации
         * private double numberOfWaterLoweringWells; // Количество водопонизительных
         * скважин
         * private double wellPitch; // Шаг скважин
         */

        // напор в области питания

      /*   public double pressureInTheFieldOfNutrition(double num1, double num2) {

                return Math.round((num1 - num2)
                                * 100)
                                / 100.00;

        }

        // Понижение уровня подземных вод в центре системы

        public double loweringOfTheGroundwaterLevel(double num1, double num2) {

                return Math.round((num1 - num2) * 100)
                                / 100.00;
        }

        // Понижение уровня подземных вод в напорном режиме

        public double loweringOfWaterInPressureMode(double num1, double num2) {

                return Math.round((num1 - num2) * 100)
                                / 100.00;
        }

        // Понижение уровня подземных вод в безнапорном режиме

        public double loweringOfWaterInNonPressureMode(double num1, double num2) {

                return Math.round((num1 - num2) * 100)
                                / 100.00;
        }

        // Напор в центре системы
        public double pressureITheCenterOfTheSystem() {

                return Math.round((pressureInTheFieldOfNutrition() - loweringOfTheGroundwaterLevel()) * 100)
                                / 100.00;
        }

        /// Мощность водоносного слоя

        public double theCapacityOfTheAquifer() {

                return Math.round((input.getMarkOfTheUpperWaterBarrier() - input.getTheMarkOfTheLowerWaterBarrier())
                                * 100)
                                / 100.00;
        }

        // Средняя глубина фильтрационного потока при напорно-безнапорной фильтрации

        public double theAverageDepthOfTheFiltrationFloDuringressureFreeFiltration() {

                return Math.round(((2 * pressureInTheFieldOfNutrition() * theCapacityOfTheAquifer()
                                - theCapacityOfTheAquifer() * theCapacityOfTheAquifer()
                                - pressureITheCenterOfTheSystem() * pressureITheCenterOfTheSystem())
                                / (2 * loweringOfTheGroundwaterLevel()))
                                * 100)
                                / 100.00;
        }

        // Приведённый радиус водопонизительной системы(Расчёт через площадь)
        public double theReducedRadiusOfTheWaterLoweringSystemSQR() {

                return Math.round((Math.sqrt(input.getWaterReductionArea() / Math.PI))
                                * 100)
                                / 100.00;
        }

        // Радиус депрессии

        public double depressionRadius1() {

                return Math.round((theReducedRadiusOfTheWaterLoweringSystemSQR())
                                * 100)
                                / 100.00;
        }

} */