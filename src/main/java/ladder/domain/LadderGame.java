package ladder.domain;

import ladder.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class LadderGame {

    private List<Line> ladder;
    private int countOfPlayer;
    private int height;
    public LadderGame(int countOfPlayer, int height) {
        init(countOfPlayer, height);
    }

    private void init(int countOfPlayer, int height) {
        this.countOfPlayer = countOfPlayer;
        this.height = height;
        build();
    }

    public void build() {
        ladder = new ArrayList<Line>();

        for (int row = 0; row < height; row++) {

            ladder.add(new Line(countOfPlayer));
        }
        OutputView.printLadderGame(ladder);
    }
}