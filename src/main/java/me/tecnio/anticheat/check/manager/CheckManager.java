package me.tecnio.anticheat.check.manager;

import lombok.experimental.UtilityClass;
import me.tecnio.anticheat.check.Check;
import me.tecnio.anticheat.data.PlayerData;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

@UtilityClass
public final class CheckManager {

    public final Class<?>[] CHECKS = new Class[]{
    };

    private final List<Constructor<?>> CONSTRUCTORS = new ArrayList<>();

    public List<Check> loadChecks(final PlayerData data) {
        final List<Check> checkList = new ArrayList<>();
        for (final Constructor<?> constructor : CONSTRUCTORS) {
            try {
                checkList.add((Check) constructor.newInstance(data));
            } catch (final Exception exception) {
                System.err.println("Failed to load checks for " + data.getPlayer().getName());
                exception.printStackTrace();
            }
        }
        return checkList;
    }

    public void setup() {
        for (final Class<?> clazz : CHECKS) {
            try {
                CONSTRUCTORS.add(clazz.getConstructor(PlayerData.class));
            } catch (final NoSuchMethodException exception) {
                exception.printStackTrace();
            }
        }
    }
}
