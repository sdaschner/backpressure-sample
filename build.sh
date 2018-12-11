#!/bin/bash
set -euo pipefail

pushd mp-ft
  mvn clean package
  docker build -t sdaschner/ft-reproducer:1 .
popd

pushd porcupine
  mvn clean package
  docker build -t sdaschner/ft-reproducer:2 .
popd
