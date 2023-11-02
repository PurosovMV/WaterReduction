package model;

// Расчёт водопонижения при напорно-безнапорном режиме фильтрации

public class PressureFreeFiltrationMode {
        /* Calculate calculate = new Calculate(); */

        public void pressureFreeFiltrationMode() {
                Scan scan = new Scan();

                double markingOfTheGroundwaterLevel = scan.number("Отметка уровня подземных вод: ");
                double theMarkOfTheLowerWaterBarrier = scan.number("Отметка нижнего водоупора: ");
                double waterReductionArea = scan.number("Площадь ограниченная контуром водопонижения: ");
                double markOfTheUpperWaterBarrier = scan.number("Отметка верхнего водоупора: ");
                double markOfThDowngradeLevel = scan.number("Отметка уровня понижения: ");
                double filterDiameter = scan.number("Диаметр фильтра: ");
                double filtrationCoefficient = scan.number("Коэффициент фильтрации: ");
                double numberOfWaterLoweringWells = scan.number("Количество водопонизительных скважин: ");
                double wellPitch = scan.number("Шаг скважин: ");

                Input input = new Input(waterReductionArea, filterDiameter, markOfTheUpperWaterBarrier,
                                theMarkOfTheLowerWaterBarrier, markOfThDowngradeLevel, markingOfTheGroundwaterLevel,
                                filtrationCoefficient, numberOfWaterLoweringWells, wellPitch);

                // напор в области питания
                double pressureInTheFieldOfNutrition = Math.round(
                                (input.getMarkingOfTheGroundwaterLevel() - input.getTheMarkOfTheLowerWaterBarrier())
                                                * 100)
                                / 100.00;
                System.out.println("Напор в области питания: " + pressureInTheFieldOfNutrition);

                // Понижение уровня подземных вод в центре системы

                double loweringOfTheGroundwaterLevel = Math.round(
                                (input.getMarkingOfTheGroundwaterLevel() - input.getMarkOfThDowngradeLevel()) * 100)
                                / 100.00;
                System.out.println(
                                "Понижение уровня подземных вод  в центре системы: " + loweringOfTheGroundwaterLevel);

                // Понижение уровня подземных вод в напорном режиме

                double loweringOfWaterInPressureMode = Math.round(
                                (input.getMarkingOfTheGroundwaterLevel() - input.getMarkOfTheUpperWaterBarrier()) * 100)
                                / 100.00;
                System.out.println(
                                "Понижение уровня подземных вод в напорном режиме: " + loweringOfWaterInPressureMode);

                // Понижение уровня подземных вод в безнапорном режиме

                double loweringOfWaterInNonPressureMode = Math.round(
                                (input.getMarkOfTheUpperWaterBarrier() - input.getMarkOfThDowngradeLevel()) * 100)
                                / 100.00;

                System.out.println(
                                "Понижение уровня подземных вод  в безнапорном режиме: "
                                                + loweringOfWaterInNonPressureMode);

                // Напор в центре системы
                double pressureITheCenterOfTheSystem = Math
                                .round((pressureInTheFieldOfNutrition - loweringOfTheGroundwaterLevel) * 100) / 100.00;
                System.out.println("Напор в центре системы: " + pressureITheCenterOfTheSystem);

                /// Мощность водоносного слоя

                double theCapacityOfTheAquifer = Math.round(
                                (input.getMarkOfTheUpperWaterBarrier() - input.getTheMarkOfTheLowerWaterBarrier())
                                                * 100)
                                / 100.00;

                System.out.println("Мощность водоносного слоя: " + theCapacityOfTheAquifer);

                // Средняя глубина фильтрационного потока при напорно-безнапорной фильтрации

                double theAverageDepthOfTheFiltrationFloDuringressureFreeFiltration = Math
                                .round(((2 * pressureInTheFieldOfNutrition * theCapacityOfTheAquifer
                                                - theCapacityOfTheAquifer * theCapacityOfTheAquifer
                                                - pressureITheCenterOfTheSystem * pressureITheCenterOfTheSystem)
                                                / (2 * loweringOfTheGroundwaterLevel)) * 100)
                                / 100.00;

                System.out.println("Средняя глубина фильтрационного потока при напорно-безнапорной фильтрации: "
                                + theAverageDepthOfTheFiltrationFloDuringressureFreeFiltration);

                // Приведённый радиус водопонизительной системы(Расчёт через площадь)
                double theReducedRadiusOfTheWaterLoweringSystem = Math
                                .round((Math.sqrt(input.getWaterReductionArea() / Math.PI)) * 100) / 100.00;

                System.out.println("Приведённый радиус водопонизительной системы: "
                                + theReducedRadiusOfTheWaterLoweringSystem);

        }

}
