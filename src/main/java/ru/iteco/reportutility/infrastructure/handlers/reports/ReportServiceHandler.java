package ru.iteco.reportutility.infrastructure.handlers.reports;

import ru.iteco.reportutility.services.ReportService;

/**
 * 17.11.2020
 *
 * @author a.chernyavskiy0n
 */
public class ReportServiceHandler {
    private ReportHandler handler;

    public ReportServiceHandler(String[] arg) {
        handler = new ErrorReportServiceHandler(null);
        handler = new TxtReportServiceHandler(handler);
        handler = new XlslReportServiceHandler(handler);
        handler = new CsvReportServiceHandler(handler);
    }
    public ReportService defineHandler(String[] args) throws Exception {
        return handler.peek(args);
    }
}
