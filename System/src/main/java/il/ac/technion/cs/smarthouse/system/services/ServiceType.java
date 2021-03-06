package il.ac.technion.cs.smarthouse.system.services;

import il.ac.technion.cs.smarthouse.system.services.alerts_service.AlertsManager;
import il.ac.technion.cs.smarthouse.system.services.communication_services.EmailService;
import il.ac.technion.cs.smarthouse.system.services.communication_services.PhoneService;
import il.ac.technion.cs.smarthouse.system.services.communication_services.SmsService;
import il.ac.technion.cs.smarthouse.system.services.file_system_service.FileSystemService;
import il.ac.technion.cs.smarthouse.system.services.sensors_service.SensorsService;
import il.ac.technion.cs.smarthouse.system.services.user_info_service.UserInfoManager;

/**
 * An enum of the classes of the available services. The services must extend
 * {@link Service}
 * 
 * @author RON
 * @since 02-04-2017
 */
public enum ServiceType {
    SENSORS_SERVICE(SensorsService.class),
    FILE_SYSTEM_SERVICE(FileSystemService.class),
    USER_INFORMATION_SERVICE(UserInfoManager.class),
    ALERTS_SERVICE(AlertsManager.class),
    EMAIL_SERVICE(EmailService.class),
    PHONE_SERVICE(PhoneService.class),
    SMS_SERVICE(SmsService.class);
    private Class<? extends Service> serviceClass;

    private ServiceType(final Class<? extends Service> serviceClass) {
        this.serviceClass = serviceClass;
    }

    public Class<? extends Service> getServiceClass() {
        return serviceClass;
    }
}
