package backend.resource.invoice.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class InvoiceRequestDto {
    private LocalDateTime date;
    private int limit; // 페이지 당 항목 수
    private int offset; // 데이터 시작 지점
    private String invoiceType;
}