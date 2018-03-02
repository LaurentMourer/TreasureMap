package manager;

import domain.Adventurer;
import domain.TreasureMap;

import java.util.Arrays;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;


final class FileHelper {

    static void writeInFile(final TreasureMap treasureMap,
                            final List<Adventurer> adventurers) {
        final List<String> lines = newArrayList();

        lines.add(treasureMap.toString());

        Arrays.stream(treasureMap.getTreasureMap()).forEach(aCase -> {
            lines.add(Arrays.toString(aCase));
        });

        adventurers.forEach(adventurer -> {
            lines.add(adventurer.toString());
        });

        FileManager.writeFile(lines);
    }

    private FileHelper() {
        // NOP
    }
}