package frc.robot.utilities;

import edu.wpi.first.math.geometry.Translation2d;
import lombok.Builder;
import lombok.Getter;

@Builder
public class ModuleInfo {
  @Getter private SwerveModuleName name;
  @Getter private PIDFFGains driveGains;
  @Getter private PIDFFGains azimuthGains;
  @Getter private int driveCANId;
  @Getter private int aziCANId;
  @Getter private int aziEncoderCANId;
  @Getter private double offset;
  @Getter private Translation2d location;
}
