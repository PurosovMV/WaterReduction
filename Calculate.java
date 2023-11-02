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

        Scan scan = new Scan();
         

        double markingOfTheGroundwaterLevel = scan.number("Отметка уровня подземных вод: ");
        double theMarkOfTheLowerWaterBarrier = scan.number("Отметка нижнего водоупора: ");
        double waterReductionArea = scan.number("Площадь ограниченная контуром водопонижения: ");
        double markOfTheUpperWaterBarrier = scan.number("Отметка верхнего водоупора: ");
        double markOfThDowngradeLevel = scan.number("Отметка уровня понижения водопонижения: ");
        double filterDiameter = scan.number("Диаметр фильтра: ");
        double filtrationCoefficient = scan.number("Коэффициент фильтрации: ");
        double numberOfWaterLoweringWells = scan.number("Количество водопонизительных скважин: ");
        double wellPitch = scan.number("Шаг скважин: ");

        Input input = new Input(waterReductionArea, filterDiameter, markOfTheUpperWaterBarrier,
                        theMarkOfTheLowerWaterBarrier, markOfThDowngradeLevel, markingOfTheGroundwaterLevel,
                        filtrationCoefficient, numberOfWaterLoweringWells, wellPitch);


        

        // напор в области питания

        public double pressureInTheFieldOfNutrition() {

                return Math.round((input.getMarkingOfTheGroundwaterLevel() - input.getTheMarkOfTheLowerWaterBarrier())
                                * 100)
                                / 100.00;

        }

        // Понижение уровня подземных вод в центре системы

        public double loweringOfTheGroundwaterLevel() {

                return Math.round((input.getMarkingOfTheGroundwaterLevel() - input.getMarkOfThDowngradeLevel()) * 100)
                                / 100.00;
        }

        // Понижение уровня подземных вод в напорном режиме

        public double loweringOfWaterInPressureMode() {

                return Math.round(
                                (input.getMarkingOfTheGroundwaterLevel() - input.getMarkOfTheUpperWaterBarrier()) * 100)
                                / 100.00;
        }

        // Понижение уровня подземных вод в безнапорном режиме

        public double loweringOfWaterInNonPressureMode() {

                return Math.round((input.getMarkOfTheUpperWaterBarrier() - input.getMarkOfThDowngradeLevel()) * 100)
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

}