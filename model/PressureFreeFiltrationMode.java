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
                double markOfThDowngradeLevel = scan.number("Отметка уровня понижения водопонижения: ");
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

                /*
                 * System.out.println("Напор в области питания: " +
                 * calculate.pressureInTheFieldOfNutrition());
                 * System.out
                 * .println("Понижение уровня подземных вод  в центре системы: "
                 * + calculate.loweringOfTheGroundwaterLevel());
                 * System.out
                 * .println("Понижение уровня подземных вод в напорном режиме: "
                 * + calculate.loweringOfWaterInPressureMode());
                 * System.out
                 * .println(
                 * "Понижение уровня подземных вод  в безнапорном режиме: "
                 * + calculate.loweringOfWaterInNonPressureMode());
                 * System.out
                 * .println(
                 * "Напор в центре системы: " + calculate.pressureITheCenterOfTheSystem());
                 * System.out
                 * .println(
                 * "Мощность водоносного слоя: " + calculate.theCapacityOfTheAquifer());
                 * 
                 * System.out
                 * .println(
                 * "Средняя глубина фильтрационного потока при напорно-безнапорной фильтрации: "
                 * + calculate.theAverageDepthOfTheFiltrationFloDuringressureFreeFiltration());
                 * 
                 * System.out
                 * .println(
                 * "Приведённый радиус водопонизительной системы: "
                 * + calculate.theReducedRadiusOfTheWaterLoweringSystemSQR());
                 */
        }

}
