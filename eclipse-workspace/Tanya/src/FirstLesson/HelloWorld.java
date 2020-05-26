package FirstLesson;

public static int substringCount(String s, String pattern) {
    // можно сначала поделать проверки на аргументы
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + pattern.length()).equalsIgnoreCase(pattern)) {
                result++;
                i += pattern.length();
            }
        }
        return result;
    }
}

