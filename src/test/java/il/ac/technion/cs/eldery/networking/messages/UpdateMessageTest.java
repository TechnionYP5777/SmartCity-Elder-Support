package il.ac.technion.cs.eldery.networking.messages;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.google.gson.JsonParser;

import il.ac.technion.cs.eldery.sensors.simulators.stove.StoveSensor;

/** @author Sharon
 * @since 11.12.16 */
@SuppressWarnings("static-method")
public class UpdateMessageTest {
  @Test public void basicUpdateMessageTest() {
    StoveSensor sensor = new StoveSensor("Stove Sensor", "00:11:22:33:44:55");
    Map<Object, Object> data = new HashMap<>();
    data.put("on", Boolean.FALSE);
    data.put("temperature", "100");
    UpdateMessage message = new UpdateMessage(sensor, data);
    JsonParser parser = new JsonParser();
    Assert.assertEquals(parser.parse(message.toJson()),
        parser.parse("{\"type\":\"UPDATE\", \"id\":\"00:11:22:33:44:55\", \"data\": {\"on\":\"false\", \"temperature\":\"100\"}}"));
  }
}