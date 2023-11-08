package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public int inputMoney() {
        while (true) {
            try {
                System.out.println("구입금액을 입력해 주세요.");
                return Integer.parseInt(Console.readLine());

            } catch (IllegalArgumentException e) {
                System.out.println("[ERROR] 금액은 숫자를 입력해야 합니다.");
            }
        }
    }

    public String inputLucky() {

        System.out.println("당첨 번호를 입력해 주세요.");
        return Console.readLine();
    }

    public int inputBonus() {
        while (true) {
            try {
                //System.out.println();
                System.out.println("보너스 번호를 입력해 주세요.");
                String bonus = Console.readLine();
                return Integer.parseInt(bonus);
            } catch (IllegalArgumentException e) {
                System.out.println("[ERROR] 금액은 숫자를 입력해야 합니다.");
            }
        }
    }


}
