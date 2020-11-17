package ru.iteco.reportutility.services;

import ru.iteco.reportutility.models.Report;

/**
 * ReportService.
 *
 * @author Ilya_Sukhachev
 */
//фабричный метод для создания разных видов отчетности
public interface ReportService {

    Report createReport();
}
