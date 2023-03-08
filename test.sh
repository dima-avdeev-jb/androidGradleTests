#!/bin/bash
cd "$(dirname "$0")" # Run always in current dir
set -euo pipefail # Fail fast

# Unit tests
#./gradlew :library:test
#./gradlew :library:desktopTest

# Android integration tests
./gradlew :library:pixel5DebugAndroidTest

