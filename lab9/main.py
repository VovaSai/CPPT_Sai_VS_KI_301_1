from Boots import Boots

if __name__ == "__main__":
    # Створюємо чоботи
    boots = Boots("Timberland", 42, "шкіра", "зима", True)

    # 1. Початковий стан взуття
    print("\n1. Початковий стан взуття:")
    print(boots.get_status())

    # 2. Носіння взуття
    print("\n2. Носіння взуття:")
    boots.wear(30)
    print(boots.get_status())

    # 3. Чищення взуття
    print("\n3. Чищення взуття:")
    boots.clean()
    print(boots.get_status())

    # 4. Перевірка водостійкості
    print("\n4. Перевірка водостійкості:")
    boots.check_waterproof()

    # 5. Додавання підошви після зносу
    print("\n5. Ремонт підошви:")
    boots.repair_sole()
    print(boots.get_status())

    # 6. Носіння взуття до зносу
    print("\n6. Зношення взуття до зносу:")
    boots.wear(80)
    print(boots.get_status())

    # 7. Повторний ремонт підошви
    print("\n7. Повторний ремонт підошви:")
    boots.repair_sole()
    print(boots.get_status())

    # 8. Перевірка стану матеріалу
    print("\n8. Перевірка стану матеріалу:")
    if boots.material == "шкіра":
        print("Матеріал зносостійкий.")
    else:
        print("Матеріал потребує особливого догляду.")

    # 9. Спроба носіння з критичним зносом
    print("\n9. Спроба носіння з критичним зносом:")
    boots.wear(50)
    print(boots.get_status())

    # 10. Фінальний стан взуття
    print("\n10. Фінальний стан взуття:")
    print(boots.get_status())