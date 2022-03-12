
package liga.medical;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Some text here.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeviceIdentificationDto {

    private Long deviceId;

    private Long ownerId;

    /**
     * Медицинские данные.
     */
    private MedicalData medicalData;
}