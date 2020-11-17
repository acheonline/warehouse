package ru.iteco.reportutility.infrastructure.handlers.reports;

import ru.iteco.reportutility.services.CsvReportService;
import ru.iteco.reportutility.services.ReportService;

/**
 * 17.11.2020
 *
 * @author a.chernyavskiy0n
 */
public class CsvReportServiceHandler extends ReportHandler {
    public CsvReportServiceHandler(ReportHandler handler) {
        super(handler);
    }

    @Override
    public ReportService peek(String[] args) throws Exception {
        if (args[0].endsWith(".csv")) {
            return new CsvReportService(args);
        }
        return super.peek(args);
    }
}
