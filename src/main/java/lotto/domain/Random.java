package lotto.domain;

import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class Random {

    public static List<Integer> makeNumber() {
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
        return numbers;
    }
}