package ru.iteco.reportutility.infrastructure;

import ru.iteco.reportutility.models.DataRow;
import ru.iteco.reportutility.models.Report;

/**
 * DataTransformer.
 *
 * @author Ilya_Sukhachev
 */
//фабричный метод для использования разных видов трансформеров
public interface DataTransformer {

    Report transformData(DataRow[] data);
}
