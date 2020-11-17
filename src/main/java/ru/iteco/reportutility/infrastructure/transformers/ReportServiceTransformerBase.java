package ru.iteco.reportutility.infrastructure.transformers;

import ru.iteco.reportutility.infrastructure.DataTransformer;
import ru.iteco.reportutility.models.DataRow;
import ru.iteco.reportutility.models.Report;

/**
 * ReportServiceTransformerBase.
 *
 * @author Ilya_Sukhachev
 */
//шаблонный метод. ReportServiceTransformerBase - асбтракный шаблонный класс. Потомки реализуют его protected функциональность
public abstract class ReportServiceTransformerBase implements DataTransformer {

    protected final DataTransformer dataTransformer;

    protected ReportServiceTransformerBase(DataTransformer dataTransformer) {
        this.dataTransformer = dataTransformer;
    }

    @Override
    public abstract Report transformData(DataRow[] data);
}
